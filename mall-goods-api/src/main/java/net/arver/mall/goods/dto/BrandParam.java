package net.arver.mall.goods.dto;

import java.io.Serializable;

public class BrandParam implements Serializable {

    private String name;

    private String letter;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(final String letter) {
        this.letter = letter;
    }
}
