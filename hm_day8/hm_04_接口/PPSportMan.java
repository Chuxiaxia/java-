package hm_day8.hm_04_接口;

public class PPSportMan implements SportMan {
    @Override
    public void run() {
        System.out.println("乒乓运动员风骚走位");
    }

    @Override
    public void competition() {
        System.out.println("乒乓球比赛统治全球！");
    }
}
