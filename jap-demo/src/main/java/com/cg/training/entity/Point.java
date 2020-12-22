package com.cg.training.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Point {
    // Persistent Fields:
	@Id
    private int x;
    private int y;
    public Point() {}

    // Constructor:
  public  Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Accessor Methods:
    public int getX() { return this.x; }
    public int getY() { return this.y; }

    // String Representation:
    @Override
    public String toString() {
        return String.format("(%d, %d)", this.x, this.y);
    }
}