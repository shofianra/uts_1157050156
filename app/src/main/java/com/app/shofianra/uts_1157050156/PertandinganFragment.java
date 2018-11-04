package com.app.shofianra.uts_1157050156;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import com.app.shofianra.uts_1157050156.R;
import com.app.shofianra.uts_1157050156.PertandinganAdapter;
import com.app.shofianra.uts_1157050156.Pertandingan;



/**
 * A simple {@link Fragment} subclass.
 */
public class PertandinganFragment extends Fragment {

    @BindView(R.id.rv_pertandingan)
    RecyclerView rvPertandingan;

    private PertandinganAdapter mAdapter;
    List<Pertandingan> listPertandingan = new ArrayList<>();


    public PertandinganFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_pertandingan, container, false);
        ButterKnife.bind(this, v);

        initTokoData();
        initRecyclerView();

        return v;
    }

    private void initTokoData() {
        listPertandingan.add(new Pertandingan(
                "Persemag", "https://image.ibb.co/cZFWTL/persemag.png", "0",
                "Persebo", "https://upload.wikimedia.org/wikipedia/id/thumb/5/56/Logo_Persibo_2013.svg/424px-Logo_Persibo_2013.svg.png", "7",
                "https://faktualnews.co/2018/07/08/hasil-pertandingan-liga-3-jatim-persibo-cukur-persemag-magetan-7-0/87656/"));
        listPertandingan.add(new Pertandingan(
                "Pesemag", "https://image.ibb.co/cZFWTL/persemag.png", "2",
                "Perspa", "https://image.ibb.co/gacysf/pacitan.jpg", "0",
                "https://pacitanku.com/2018/04/19/perspa-pacitan-ditumbangkan-persemag-0-2-di-magetan/"));
        listPertandingan.add(new Pertandingan(
                "Blitar Poetra", "https://image.ibb.co/bF2ysf/Blitar-Poetra.png", "3",
                "Persemag", "https://image.ibb.co/cZFWTL/persemag.png", "0",
                "https://www.youtube.com/watch?v=pVpcnqJNjU4"));
        listPertandingan.add(new Pertandingan(
                "Persib", "https://3.bp.blogspot.com/-gYhAsYqZdCo/WCcDjqzGE0I/AAAAAAAAYnQ/07-Njkhdnegk2uwLzGdDxdpqXt38obzmgCLcB/s1600/PERSIB-LOGO.png", "4",
                "Persebaya", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/PERSEBAYA_SINCE_1927.png/222px-PERSEBAYA_SINCE_1927.png", "1",
                "https://www.liputan6.com/bola/read/3672351/susunan-pemain-persib-bandung-vs-persebaya-surabaya"));
        listPertandingan.add(new Pertandingan(
                "Arema", "https://upload.wikimedia.org/wikipedia/id/b/b9/Logo_Arema_FC_2017_logo.png", "0",
                "Persib", "https://3.bp.blogspot.com/-gYhAsYqZdCo/WCcDjqzGE0I/AAAAAAAAYnQ/07-Njkhdnegk2uwLzGdDxdpqXt38obzmgCLcB/s1600/PERSIB-LOGO.png", "2",
                "https://sport.detik.com/sepakbola/liga-indonesia/d-4210442/hasil-liga-1-persib-bandung-bekuk-arema-fc-2-0"));

    }

    private void initRecyclerView() {
        rvPertandingan.setHasFixedSize(true);
        rvPertandingan.setLayoutManager(new LinearLayoutManager(getContext()));
        mAdapter = new PertandinganAdapter(getContext(), listPertandingan);
        rvPertandingan.setAdapter(mAdapter);
    }

}
