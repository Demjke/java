package lesson1.impl;

public enum EPackage {
    PLASTIC("пластик"), GLASS("стекло");

    private final String matherial;

    EPackage(String matherial) {
        this.matherial = matherial;
    }

    public String getMatherial() {
        return matherial;
    }
}
