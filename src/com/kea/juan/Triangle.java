package com.kea.juan;

public class Triangle {

  private int x;
  private int y;
  private int z;

  public Triangle(int x, int y, int z) { //triangle constructor with variables
    this.x = x;
    this.y = y;
    this.z = z;
  }

  //Getters and Setters
  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int getZ() {
    return z;
  }

  public void setZ(int z) {
    this.z = z;
  }

  @Override //toString() method to print object
  public String toString() {
    return "Triangle{" + "X=" + x + ", Y=" + y + ", Z=" + z + '}';
  }

}


