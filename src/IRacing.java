/**
 * Racing interface
 * start() 레이싱 시작
 * accelerate() 기본 가속 및 거리 이동
 * accelerate_booster() 레벨별 부스터
 * drift() 회전
 * decelerateAs() 감속
 * */
interface IRacing{
    void start();
    void accelerate();
    void accelerate_booster(int speed_lv);
    void drift();
    void decelerateAs();
}