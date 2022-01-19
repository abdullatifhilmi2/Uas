package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Buaya;
import simple.example.hewanpedia.model.Burung;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Ular;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Burung> initDataBurung(Context ctx) {
        List<Burung> burungs = new ArrayList<>();
        burungs.add(new Burung(ctx.getString(R.string.Angora_nama),ctx.getString(R.string.Angora_asal),
                ctx.getString(R.string.Angora_deskripsi),R.drawable.jalak_suren));
        burungs.add(new Burung(ctx.getString(R.string.Bengal_nama),ctx.getString(R.string.Bengal_asal),
                ctx.getString(R.string.Bengal_deskripsi), R.drawable.jalak_bali));
        burungs.add(new Burung(ctx.getString(R.string.Birmani_nama),ctx.getString(R.string.Birmani_asal),
                ctx.getString(R.string.Birmani_deskripsi), R.drawable.jalak_thailand));
        burungs.add(new Burung(ctx.getString(R.string.Persia_nama),ctx.getString(R.string.Persia_asal),
                ctx.getString(R.string.Persia_deskripsi), R.drawable.merak_hijau));
        burungs.add(new Burung(ctx.getString(R.string.Siam_nama),ctx.getString(R.string.Siam_asal),
                ctx.getString(R.string.Siam_deskripsi), R.drawable.kiwi));

        return burungs;
    }


    private static List<Ular>initDataUlar(Context ctx) {
        List<Ular> ulars= new ArrayList<>();
        ulars.add(new Ular(ctx.getString(R.string.Bulldog_nama), ctx.getString(R.string.Bulldog_asal),
                ctx.getString(R.string.Bulldog_deskripsi),R.drawable.ular_serasah));
        ulars.add(new Ular(ctx.getString(R.string.Husky_nama), ctx.getString(R.string.Husky_asal),
                ctx.getString(R.string.Husky_deskripsi),R.drawable.ular_gadung));
        ulars.add(new Ular(ctx.getString(R.string.Kintamani_nama), ctx.getString(R.string.Kintamani_asal),
                ctx.getString(R.string.Kintamani_deskripsi), R.drawable.ular_kawat));
        ulars.add(new Ular(ctx.getString(R.string.Samoyed_nama), ctx.getString(R.string.Samoyed_asal),
                ctx.getString(R.string.Samoyed_deskripsi), R.drawable.ular_kepala_dua));
        return ulars;
    }
    private static List<Buaya> initDataBuaya(Context ctx) {
        List<Buaya> buayas = new ArrayList<>();
        buayas.add(new Buaya(ctx.getString(R.string.monyet_bekantan_nama),ctx.getString(R.string.monyet_bekantan_asal),
                ctx.getString(R.string.monyet_bekantan_deskripsi), R.drawable.buaya_muara));
        buayas.add(new Buaya(ctx.getString(R.string.monyet_owa_jawa_nama),ctx.getString(R.string.monyet_owa_jawa_asal),
                ctx.getString(R.string.monyet_owa_jawa_deskripsi), R.drawable.buaya_sepit));
        buayas.add(new Buaya(ctx.getString(R.string.monyet_daun_natuna_nama),ctx.getString(R.string.monyet_daun_natuna_asal),
                ctx.getString(R.string.monyet_daun_natuna_deskripsi), R.drawable.buaya_sepit));
        buayas.add(new Buaya(ctx.getString(R.string.monyet_tarsisus_kecil_nama),ctx.getString(R.string.monyet_tarsisus_kecil_asal),
                ctx.getString(R.string.monyet_tarsisus_kecil_deskripsi), R.drawable.buaya_irian));
        return buayas;
    }


    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataBurung(ctx));
        hewans.addAll(initDataUlar(ctx));
        hewans.addAll(initDataBuaya(ctx));
    }
    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}