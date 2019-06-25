package com.diana.application.data.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Diana on 25.06.2019.
 */

public class Card extends RealmObject {

    @PrimaryKey
    private long productId;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Card) {
            return ((Card)obj).getProductId() == getProductId();
        }
        return false;
    }
}
