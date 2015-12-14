package heshansandeepa.demo_coordinateexamples;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.SwipeDismissBehavior;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class Swipe extends AppCompatActivity {

    private CardView mCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe);

        mCardView = (CardView) findViewById(R.id.swype_card);

        final SwipeDismissBehavior<CardView> swipe = new SwipeDismissBehavior();
        swipe.setSwipeDirection(SwipeDismissBehavior.SWIPE_DIRECTION_ANY);
        swipe.setListener(new SwipeDismissBehavior.OnDismissListener() {
            @Override public void onDismiss(View view) {
                Toast.makeText(Swipe.this,
                        "Card swiped !!", Toast.LENGTH_SHORT).show();
            }

            @Override public void onDragStateChanged(int state) {}
        });

        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) mCardView.getLayoutParams();
        layoutParams.setBehavior(swipe);
    }

}
