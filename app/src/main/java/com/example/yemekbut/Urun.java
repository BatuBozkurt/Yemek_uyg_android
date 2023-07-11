package com.example.yemekbut;

public class Urun {
    private String urunAdi;
    private String urunAciklama;
    private int urunImgSrc;

    public Urun() {
        // Boş yapıcı metot
    }

    public Urun(String urunAdi, String urunAciklama, int urunImgSrc) {
        this.urunAdi = urunAdi;
        this.urunAciklama = urunAciklama;
        this.urunImgSrc = urunImgSrc;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public String getUrunAciklama() {
        return urunAciklama;
    }

    public void setUrunAciklama(String urunAciklama) {
        this.urunAciklama = urunAciklama;
    }

    public int getUrunImgSrc() {
        return urunImgSrc;
    }

    public void setUrunImgSrc(int urunImgSrc) {
        this.urunImgSrc = urunImgSrc;
    }
}