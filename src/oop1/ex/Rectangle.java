package oop1.ex;

public class Rectangle {
  int width;
  int height;

  // 넓이
  int calculateArea() {
    return width * height;
  }

  // 둘레
  int calculatePerimeter() {
    return (width + height) * 2;
  }

  // 정사각형 여부
  boolean isSquare() {
    return width == height;
  }
}
