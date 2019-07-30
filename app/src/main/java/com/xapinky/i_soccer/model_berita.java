package com.xapinky.i_soccer;

import java.lang.reflect.Constructor;

public class model_berita {
    private String judul_berita;
    private String isi_berita;
    private String gambar_berita;

    public model_berita() {
    }

    public String getJudul_berita() {
        return judul_berita;
    }

    public void setJudul_berita(String judul_berita) {
        this.judul_berita = judul_berita;
    }

    public String getIsi_berita() {
        return isi_berita;
    }

    public void setIsi_berita(String isi_berita) {
        this.isi_berita = isi_berita;
    }

    public String getGambar_berita() {
        return gambar_berita;
    }

    public void setGambar_berita(String gambar_berita) {
        this.gambar_berita = gambar_berita;
    }

    @Override
    public String toString() {
        return " " +gambar_berita+ "\n" +
                " " +isi_berita+ "\n" +
                " " +judul_berita;
    }
}
