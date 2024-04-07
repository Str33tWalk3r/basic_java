package edu.ntudp.chekushkin.model;

public enum Sex {
    Male(1),
    Female(2),
    SomeNew(3);

    private final int id;

    Sex(int id) {
        this.id = id;
    }

    public static Sex fromRawType(int rawType) {
        if (rawType == Male.id) {
            return Male;
        }

        if (rawType == Female.id) {
            return Female;
        }

        if (rawType == SomeNew.id) {
            return SomeNew;
        }

        throw new ClassCastException();
    }
}

