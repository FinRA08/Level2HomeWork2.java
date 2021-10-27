package level2.homeworc1;

public class Robot implements Jumping, Running {
    private String name;
    private int jumpHeight;
    private int runningSpeed;

    public Robot(String name, int jumpHeight, int runningSpeed){
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runningSpeed = runningSpeed;
    }

    public Robot(String name){
        this.name = name;
    }

    @Override
    public void jump(){
        System.out.println("Робот по имени - " + name + " подпрыгнул");
    }

    @Override
    public void run(){
        System.out.println("Робот по имени - " + name + " побежал");
    }

    @Override
    public void jumpOverTheWall(){
        if (Wall.h < jumpHeight || Wall.h == jumpHeight){
            System.out.println(name + " Перепрыгнул через стену. Даже не заметил её.");
        }else {
            System.out.println(name + " Не допрыгнул. Что то явно нужно переделать");
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
