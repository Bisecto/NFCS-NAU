package com.bisector.nfcsnau;

import android.content.Intent;
import android.icu.text.SymbolTable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationBarMenu;

import java.util.ArrayList;


public class Prayer extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;

    public Prayer() {
    }
    public static Prayer newInstance(String param1, String param2) {
        Prayer fragment = new Prayer();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        RecyclerView recyclerView;
        View view = inflater.inflate(R.layout.fragment_prayer,container,false);
        NavigationBarMenu navigationBarMenu;
        recyclerView=view.findViewById(R.id.recycle);
        arrayadapter adapter;
        ArrayList<array> List_Prayer;
        List_Prayer=new ArrayList<>();
        List_Prayer.add(new array("NFCS Daily Prayer"));
        List_Prayer.add(new array("Ekpere Ubochi Nile nke ndi NFCS"));
        List_Prayer.add(new array("Novena to the Holy Spirit"));
        List_Prayer.add(new array("The Holy Rosary"));
        List_Prayer.add(new array("The Catena Rosary"));
        List_Prayer.add(new array("Rosari Di Aso"));
        List_Prayer.add(new array("Fifteen promises of Mary to Christains who recite the rosary"));
        List_Prayer.add(new array("Act of Consecration to the Immaculate Heart of Mary"));
        List_Prayer.add(new array("Memorare"));
        List_Prayer.add(new array("Angelus"));
        List_Prayer.add(new array("Regina Ceali"));
        List_Prayer.add(new array("Chaplet of Divine Mercy"));
        List_Prayer.add(new array("Act of consecration to the Sacred Heart of Jesus"));
        List_Prayer.add(new array("Litany of the Sacred Heart of Jesus"));
        List_Prayer.add(new array("Prayer to St. Joseph (October)"));
        List_Prayer.add(new array("Aririo a na-ario Joseph di aso"));
        List_Prayer.add(new array("Daily Prayer of Purgatorian"));
        List_Prayer.add(new array("Prayer to St. Michael"));
        List_Prayer.add(new array("Prayer to Our Guardian Angel"));
        List_Prayer.add(new array("Prayer for Study"));
        List_Prayer.add(new array("Prayer for Knowledge"));
        List_Prayer.add(new array("Prayer for Examination"));
        List_Prayer.add(new array("Grace for Hard Work"));
        List_Prayer.add(new array("For Self Control"));
        List_Prayer.add(new array("For Courage"));
        List_Prayer.add(new array("For Eternal Life"));
        List_Prayer.add(new array("For Faith"));
        List_Prayer.add(new array("For the Poor"));
        List_Prayer.add(new array("For our Country"));
        List_Prayer.add(new array("For Priests"));
        List_Prayer.add(new array("Prayer for a Good Christain Life"));
        List_Prayer.add(new array("Prayer to Jesus Crucified"));
        List_Prayer.add(new array("Prayer for Daily Neglects"));
        List_Prayer.add(new array("The Spiritual Communion"));
        List_Prayer.add(new array("Prayers Before and After Meals"));
        List_Prayer.add(new array("Act of Faith"));
        List_Prayer.add(new array("Act of Hope"));
        List_Prayer.add(new array("Act of Charity"));
        List_Prayer.add(new array("A Short Table of Sin on the Commandments"));
        List_Prayer.add(new array("Method of Confession"));
        List_Prayer.add(new array("Prayer Before Confession"));
        List_Prayer.add(new array("Prayer after Confession"));
        List_Prayer.add(new array("Confiteor"));
        List_Prayer.add(new array("Act of Contrition"));
        List_Prayer.add(new array("Prayer before a Crucifix"));
        List_Prayer.add(new array("Ejaculations"));
        List_Prayer.add(new array("Lord Jesus"));
        List_Prayer.add(new array("Lord Jesus"));
        List_Prayer.add(new array("The Universal Prayer"));
        List_Prayer.add(new array("Prayer to obtain the graces of all worlds' masses"));
        List_Prayer.add(new array("Grace derived from assisting/participating at mass"));
        List_Prayer.add(new array("Prayers before Holy Communion"));
        List_Prayer.add(new array("Prayers after Holy Communion"));
        List_Prayer.add(new array("Prayer of St. Thomas Aquinas after Holy Communion"));
        List_Prayer.add(new array("Anima Christi"));
        List_Prayer.add(new array("Preparation for Mass (Prayer of St. Thomas Aquinas)"));
        List_Prayer.add(new array("The New Order of Mass with Congregation (In English)"));
        List_Prayer.add(new array("Order of Mass (In Latin)"));
        List_Prayer.add(new array("Usoro Emume Misa"));
        List_Prayer.add(new array("The Benedictus"));
        List_Prayer.add(new array("The Magnificat (English & Igbo)"));
        List_Prayer.add(new array("Prayer to our Lord in Character of King in"));
        List_Prayer.add(new array("Blessed Sacrament."));
        List_Prayer.add(new array("Benediction (Latin & English)"));
        List_Prayer.add(new array("Benediction (In Igbo)"));
        List_Prayer.add(new array("The Stations of the Cross"));
        List_Prayer.add(new array("Hymns for Stations of the Cross"));
        List_Prayer.add(new array("Uzo nke Obe"));
        List_Prayer.add(new array("Ukwe Uzo nke Obe"));
        List_Prayer.add(new array("The fourteen promises of our Lord via Saint Estanislao"));
        List_Prayer.add(new array("Novena devotions in honour of Saint Albert the Great"));
        List_Prayer.add(new array("The Itinerarium"));

        RecyclerView.LayoutManager layoutManager;
        layoutManager = new LinearLayoutManager(getContext());
        adapter = new arrayadapter(List_Prayer);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        adapter.setOnClickListener(new arrayadapter.OnItemClickListener() {
            @Override
            public void OnItemClick(int position) {
                array arr=List_Prayer.get(position);
                String lis = arr.getList();
                Intent i=new Intent(getContext(),SinglePrayer.class);
                switch (lis){
                    case "NFCS Daily Prayer":
                        i.putExtra("key","NFCS Daily Prayer");
                        startActivity(i);
                        return ;
                    case "Ekpere Ubochi Nile nke ndi NFCS":
                        i.putExtra("key","Ekpere Ubochi Nile nke ndi NFCS");
                        startActivity(i);
                        return;
                    case "Novena to the Holy Spirit":
                        i.putExtra("key","Novena to the Holy Spirit");
                        startActivity(i);
                        return;
                    case "The Holy Rosary":
                        i.putExtra("key","The Holy Rosary");
                        startActivity(i);
                        return;
                    case "The Catena Rosary":
                        i.putExtra("key","The Catena Rosary");
                        startActivity(i);
                        return;
                    case "Rosari Di Aso":
                        i.putExtra("key","Rosari Di Aso");
                        startActivity(i);
                        return;
                    case "Fifteen promises of Mary to Christains who recite the rosary":
                        i.putExtra("key","Fifteen promises of Mary to Christains who recite the rosary");
                        startActivity(i);
                        return;
                    case "Act of Consecration to the Immaculate Heart of Mary":
                        i.putExtra("key","Act of Consecration to the " +
                                "Immaculate Heart of Mary");
                        startActivity(i);
                        return;
                    case "Memorare":
                        i.putExtra("key","Memorare");
                        startActivity(i);
                        return;
                    case "Angelus":
                        i.putExtra("key","Angelus");
                        startActivity(i);
                        return;
                    case "Regina Ceali":
                        i.putExtra("key","Regina Ceali");
                        startActivity(i);
                        return;
                    case "Chaplet of Divine Mercy":
                        i.putExtra("key","Chaplet of Divine Mercy");
                        startActivity(i);
                        return;
                    case "Act of consecration to the Sacred Heart of Jesus":
                        i.putExtra("key","Act of consecration to the Sacred Heart of Jesus");
                        startActivity(i);
                        return;
                    case "Litany of the Sacred Heart of Jesus":
                        i.putExtra("key","Litany of the Sacred Heart of Jesus");
                        startActivity(i);
                        return;
                    case "Prayer to St. Joseph (October)":
                        i.putExtra("key","Prayer to St. Joseph (October)");
                        startActivity(i);
                        return;
                    case "Aririo a na-ario Joseph di aso":
                        i.putExtra("key","Aririo a na-ario Joseph di aso");
                        startActivity(i);
                        return;
                    case "Daily Prayer of Purgatorian":
                        i.putExtra("key","Daily Prayer of Purgatorian");
                        startActivity(i);
                        return;
                    case "Prayer to St. Michael":
                        i.putExtra("key","Prayer to St. Michael");
                        startActivity(i);
                        return;
                    case "Prayer to Our Guardian Angel":
                        i.putExtra("key","Prayer to Our Guardian Angel");
                        startActivity(i);
                        return;
                    case "Prayer for Study":
                        i.putExtra("key","Prayer for Study");
                        startActivity(i);
                        return;
                    case "Prayer for Knowledge":
                        i.putExtra("key","Prayer for Knowledge");
                        startActivity(i);
                        return;
                    case "Prayer for Examination":
                        i.putExtra("key","Prayer for Examination");
                        startActivity(i);
                        return;
                    case "Grace for Hard Work":
                        i.putExtra("key","Grace for Hard Work");
                        startActivity(i);
                        return;

                    case "For Self Control":
                        i.putExtra("key","For Self Control");
                        startActivity(i);
                        return;
                    case "For Courage":
                        i.putExtra("key","For Courage");
                        startActivity(i);
                        return;
                    case "For Eternal Life":
                        i.putExtra("key","For Eternal Life");
                        startActivity(i);
                        return;
                    case "For Faith":
                        i.putExtra("key","For Faith");
                        startActivity(i);
                        return;
                    case "For the Poor":
                        i.putExtra("key","For the Poor");
                        startActivity(i);
                        return;
                    case "For our Country":
                        i.putExtra("key","For our Country");
                        startActivity(i);
                        return;
                    case "For Priests":
                        i.putExtra("key","For Priests");
                        startActivity(i);
                        return;
                    case "Prayer for a Good Christian Life":
                        i.putExtra("key","Prayer for a Good Christian Life");
                        startActivity(i);
                        return;
                    case "Prayer to Jesus Crucified":
                        i.putExtra("key","Prayer to Jesus Crucified");
                        startActivity(i);
                        return;
                    case "Prayer for Daily Neglects":
                        i.putExtra("key","Prayer for Daily Neglects");
                        startActivity(i);
                        return;
                    case "The Spiritual Communion":
                        i.putExtra("key","The Spiritual Communion");
                        startActivity(i);
                        return;
                    case "Prayers Before and After Meals":
                        i.putExtra("key","Prayers Before and After Meals");
                        startActivity(i);
                        return;
                    case "Act of Faith":
                        i.putExtra("key","Act of Faith");
                        startActivity(i);
                        return;
                    case "Act of Hope":
                        i.putExtra("key","Act of Hope");
                        startActivity(i);
                        return;
                    case "Act of Charity":
                        i.putExtra("key","Act of Charity");
                        startActivity(i);
                        return;
                    case "A Short Table of Sin on the Commandments":
                        i.putExtra("key","A Short Table of Sin on the Commandments");
                        startActivity(i);
                        return;
                    case "Method of Confession":
                        i.putExtra("key","Method of Confession");
                        startActivity(i);
                        return;
                    case "Prayer Before Confession":
                        i.putExtra("key","Prayer Before Confession");
                        startActivity(i);
                        return;
                    case "Prayer after Confession":
                        i.putExtra("key","Prayer after Confession");
                        startActivity(i);
                        return;
                    case "Confiteor":
                        i.putExtra("key","Confiteor");
                        startActivity(i);
                        return;
                    case "Act of Contrition":
                        i.putExtra("key","Act of Contrition");
                        startActivity(i);
                        return;
                    case "Prayer before a Crucifix":
                        i.putExtra("key","Prayer before a Crucifix");
                        startActivity(i);
                        return;
                    case "Ejaculations":
                        i.putExtra("key","Ejaculations");
                        startActivity(i);
                        return;
                    case "Lord Jesus":
                        i.putExtra("key","Lord Jesus");
                        startActivity(i);
                        return;
                    case "The Universal Prayer":
                        i.putExtra("key","The Universal Prayer");
                        startActivity(i);
                        return;
                    case "Prayer to obtain the graces of all worlds' masses":
                        i.putExtra("key","Prayer to obtain the graces of all worlds' masses");
                        startActivity(i);
                        return;
                    case "Grace derived from assisting/participating at mass":
                        i.putExtra("key","Grace derived from assisting/participating at mass");
                        startActivity(i);
                        return;
                    case "Prayers before Holy Communion":
                        i.putExtra("key","Prayers before Holy Communion");
                        startActivity(i);
                        return;
                    case "Prayers after Holy Communion":
                        i.putExtra("key","Prayers after Holy Communion");
                        startActivity(i);
                        return;
                    case "Prayer of St. Thomas Aquinas after Holy Communion":
                        i.putExtra("key","Prayer of St. Thomas Aquinas after Holy Communion");
                        startActivity(i);
                        return;
                    case "Anima Christi":
                        i.putExtra("key","Anima Christi");
                        startActivity(i);
                        return;
                    case "Preparation for Mass (Prayer of St. Thomas Aquinas)":
                        i.putExtra("key","Preparation for Mass (Prayer of St. Thomas Aquinas)");
                        startActivity(i);
                        return;
                    case "The New Order of Mass with Congregation (In English)":
                        i.putExtra("key","The New Order of Mass with Congregation (In English)");
                        startActivity(i);
                        return;
                    case "Order of Mass (In Latin)":
                        i.putExtra("key","Order of Mass (In Latin)");
                        startActivity(i);
                        return;
                    case "Usoro Emume Misa":
                        i.putExtra("key","Usoro Emume Misa");
                        startActivity(i);
                        return;
                    case "The Benedictus":
                        i.putExtra("key","The Benedictus");
                        startActivity(i);
                        return;
                    case "The Magnificat (English & Igbo)":
                        i.putExtra("key","The Magnificat (English & Igbo)");
                        startActivity(i);
                        return;
                    case "Prayer to our Lord in Character of King in":
                        i.putExtra("key","Prayer to our Lord in Character of King in");
                        startActivity(i);
                        return;
                    case "Blessed Sacrament.":
                        i.putExtra("key","Blessed Sacrament.");
                        startActivity(i);
                        return;
                    case "Benediction (Latin & English)":
                        i.putExtra("key","Benediction (Latin & English)");
                        startActivity(i);
                        return;
                    case "Benediction (In Igbo)":
                        i.putExtra("key","Benediction (In Igbo)");
                        startActivity(i);
                        return;
                    case "The Stations of the Cross":
                        i.putExtra("key","The Stations of the Cross");
                        startActivity(i);
                        return;
                    case "Hymns for Stations of the Cross":
                        i.putExtra("key","Hymns for Stations of the Cross");
                        startActivity(i);
                        return;
                    case "Uzo nke Obe":
                        i.putExtra("key","Uzo nke Obe");
                        startActivity(i);
                        return;
                    case "Ukwe Uzo nke Obe":
                        i.putExtra("key","Ukwe Uzo nke Obe");
                        startActivity(i);
                        return;
                    case "The fourteen promises of our Lord via Saint Estanislao":
                        i.putExtra("key","The fourteen promises of our Lord via Saint Estanislao");
                        startActivity(i);
                        return;
                    case "Novena devotions in honour of Saint Albert the Great":
                        i.putExtra("key","Novena devotions in honour of Saint Albert the Great");
                        startActivity(i);
                        return;
                    case "The Itinerarium":
                        i.putExtra("key","The Itinerarium");
                        startActivity(i);
                        return;


                }
                return;
                }
        });
        return view;
    }
}