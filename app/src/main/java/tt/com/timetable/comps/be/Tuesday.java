package tt.com.timetable.comps.be;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import it.gmariotti.cardslib.library.view.CardViewNative;
import tt.com.timetable.Cards;
import tt.com.timetable.R;

public class Tuesday extends Fragment {

    Cards card,card1;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        return inflater.inflate(R.layout.comps_a_tue,container,false);


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
       iniCard();

    }

    private void iniCard() {
        card = new Cards(getActivity());
        card1  = new Cards(getActivity());
        card.init();
        card1.init();

        card.changeHeader("Lectures");
        card.Subtitle("10.00 to 1.00 & 3.30-4.30");
        card.addChild1("CV","10.00-11.00");
        card.addChild2("MSD","11.00-12.00");
        card.addChild2("SA","12.00-1.00");
        card.addChild2("DC","3.30-4.30");


        card1.addChild1("SA","A1 (507)");
        card1.addChild2("CV","A2 (607)");
        card1.addChild2("DC","A3 (601)");
        card1.addChild2("MSD","A4 (503)");
        card1.Subtitle("1.30 to 3.30");
        card1.changeHeader("Practicals");
        CardViewNative cardView = (CardViewNative)getActivity().findViewById(R.id.LectureCard1);
        cardView.setCard(card);
        CardViewNative cardView1 = (CardViewNative)getActivity().findViewById(R.id.pracs1);
        cardView1.setCard(card1);
    }


}
