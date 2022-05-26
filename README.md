# racing_car

아래와 같은 IRacing Interface를 RacingCar에서 implements한다. 

``` Java
interface IRacing{
    void start();
    void accelerate();
    void accelerate_booster(int speed_lv);
    void drift();
    void decelerateAs();
}
```

그리고 RacingCar를 상속받은 RacingCarV2 클래스에서 일부 동작이 다른 함수만 Overriding하여 구현한다.
``` Java

public class RacingCarV2 extends RacingCar{
 @Override
    public void start() {
        //추가 구현
    }

    
    @Override
    public void accelerate() {
        //추가 구현
    }
   
    @Override
    public void accelerate_booster(int speed_lv) {
        //추가 구현
    }
}

```
