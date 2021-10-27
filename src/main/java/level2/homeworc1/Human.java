package level2.homeworc1;

public class Human implements Jumping, Running {
    private int jumpHeight;
    private String name;
    private int runningSpeed;

    public Human(String name, int jumpHeight, int runningSpeed){
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runningSpeed = runningSpeed;
    }

    public Human(String name){
        this.name = name;
    }


    @Override
    public void jump(){
        System.out.println("Человек по имени - " + name + " подпрыгнул");
    }

    @Override
    public void run(){
        System.out.println("Человек по имени - " + name + " побежал");
    }

    @Override
    public void jumpOverTheWall(){
        if (Wall.h < jumpHeight || Wall.h == jumpHeight){
            System.out.println(name + " Перепрыгнул через стену. Красавчик");
        }else {
            System.out.println(name + " Не допрыгнул. Слабак");
        }
    }

    @Override
    public void joggingOnTheTrack(){
        if (Treadmill.s < runningSpeed || Treadmill.s == runningSpeed){
            System.out.println(name + " Пробежался по дорожке. Сил хватило");
        }else {
            System.out.println(name + " Скатился с дорожки, сил не хватило");
        }
    }
    @Override
    public String toString() {
        return  name +"   " + jumpHeight + "   " +runningSpeed;
    }
}
