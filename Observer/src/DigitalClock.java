public class DigitalClock implements Observer{
    private ClockTimer timer;

    public DigitalClock(ClockTimer ct){
        timer = ct;
        timer.attach(this);
    }

    @Override
    public void update(Subject s){
        if (s == timer){
            draw();
        }
    }

    private void draw(){
        System.out.println(timer.getHour() + ":" + timer.getMinute() + ":" + timer.getSecond());
    }
}
