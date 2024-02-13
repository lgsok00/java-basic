package access.ex;

public class ShoppingCart {
  private Item[] items = new Item[10];  // Item을 담을 수 있는 배열
  private int itemCount;

  // addItem : 상품 등록
  public void addItem(Item item) {
    // 검증 로직
    if (itemCount >= items.length) {
      System.out.println("장바구니가 가득 찼습니다.");
      return;
    }

    // 실행 로직
    items[itemCount] = item;
    itemCount++;
  }

  // displayItems : 장바구니 상품 출력
  public void displayItems() {
    System.out.println("장바구니 상품 출력");

    for (int i = 0; i < itemCount; i++) {
      Item item = items[i];  // // items에 담겨있는 item 꺼내기
      System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
    }

    System.out.println("전체 가격 합: " + calculateTotalPrice());
  }

  // calculateTotalPrice : 장바구니 전체 가격
  // private : ShoppingCart 클래스에서만 사용하므로 private으로 접근 제한
  private int calculateTotalPrice() {
    int totalPrice = 0;

    for (int i = 0; i < itemCount; i++) {
      Item item = items[i];  // items에 담겨있는 item 꺼내기
      totalPrice += item.getTotalPrice();
    }

    return totalPrice;
  }
}
