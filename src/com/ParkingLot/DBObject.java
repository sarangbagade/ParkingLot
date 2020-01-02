package com.ParkingLot;

public abstract class DBObject {
    private final long uid;
    private static long NEW_UID = 0;

    public DBObject()
    {
        this.uid = NEW_UID++;
    }

    long getUid()
    {
        return uid;
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj) return true;
        if(obj == null || obj.getClass()!=this.getClass()){
            return false;
        }
        DBObject o = (DBObject) obj;
        return this.getUid() == o.uid;
    }
}
