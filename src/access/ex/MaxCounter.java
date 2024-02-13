package access.ex;

public class MaxCounter {
  // private : 해당 클래스에서만 접근 가능
  private int count = 0;
  private int max;

  // public : 다른 패키지에서도 접근 가능
  public MaxCounter(int max) {
    this.max = max;
  }

  public void increment() {
    // 검증 로직
    if (count >= max) {
      System.out.println("최댓값을 초과할 수 없습니다.");
      return;  // return을 통해 검증과 실행을 나눈다.
    }

    // 실행 로직
    count++;
  }

  public int getCount() {
    return count;
  }
}
