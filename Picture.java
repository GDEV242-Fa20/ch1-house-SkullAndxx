/**
 * Inspired sunset walk from the Mandalorian. Added the ability to walk
 * towards the sun and away from the sun.
 * 
 * @author  Erick Rubio
 * @version 2020.09.13
 */
public class Picture
{
    private Square sky;
    private Square ground;
    private Triangle rock1;
    private Triangle rock2;
    private Triangle rock3;
    private Triangle rock4;
    private Person person1;
    private Person kid1;
    private Circle sun;
    // private Circle gliderBottom;
    // private Square gliderTop;
    private boolean drawn;
    private boolean walkedAway;
    //private boolean sunSetted;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        sky = new Square();
        ground = new Square();
        person1 = new Person(); 
        kid1 = new Person();
        sun = new Circle();
        rock1 = new Triangle();
        rock2 = new Triangle();
        rock3 = new Triangle();
        rock4 = new Triangle();
        // gliderBottom = new Circle();
        // gliderTop = new Square();
        drawn = false;
        walkedAway = false;
        //sunSetted = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            sky.moveHorizontal(-500);
            sky.moveVertical(-150);
            sky.changeSize(1000);
            sky.changeColor("blue");
            sky.makeVisible();
            
            sun.changeColor("yellow");
            sun.moveHorizontal(-100);
            sun.moveVertical(-60);
            sun.changeSize(250);
            sun.makeVisible();            
            
            ground.changeColor("brown");
            ground.moveHorizontal(-500);
            ground.moveVertical(30);
            ground.changeSize(1000);
            ground.makeVisible();
    
            rock1.changeColor("lightBrown");
            rock1.changeSize(-10,10);
            rock1.moveHorizontal(-100);
            rock1.moveVertical(100);
            rock1.makeVisible();

            rock2.changeColor("lightBrown");
            rock2.changeSize(-10,10);
            rock2.moveHorizontal(-90);
            rock2.moveVertical(90);
            rock2.makeVisible();
            
            rock3.changeColor("lightBrown");
            rock3.changeSize(25,20);
            rock3.moveHorizontal(200);
            rock3.moveVertical(70);
            rock3.makeVisible();
            
            rock4.changeColor("lightBrown");
            rock4.changeSize(15,20);
            rock4.moveHorizontal(150);
            rock4.moveVertical(100);
            rock4.makeVisible();
            
            person1.changeSize(100, 40);
            person1.moveHorizontal(-60);
            person1.moveVertical(100);
            person1.makeVisible();
            person1.slowMoveVertical(-155);
            
            kid1.changeColor("green");
            kid1.changeSize(50, 20);
            kid1.moveHorizontal(0);
            kid1.moveVertical(100);
            kid1.makeVisible();
            kid1.slowMoveVertical(-120);
                

            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        sky.changeColor("black");
        sun.changeColor("white");
        ground.changeColor("grey");
        rock1.changeColor("black");
        rock2.changeColor("black");
        rock3.changeColor("black");
        rock4.changeColor("black");
        person1.changeColor("black");
        kid1.changeColor("black");

    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        sky.changeColor("blue");
        sun.changeColor("yellow");
        ground.changeColor("brown");
        rock1.changeColor("lightBrown");
        rock2.changeColor("lightBrown");
        rock3.changeColor("lightBrown");
        rock4.changeColor("lightBrown");
        person1.changeColor("black");
        kid1.changeColor("green");

    }
    
    /**
     * Adult and kid walk towards camera
     */
    public void walkForward()
    {
        if(!walkedAway){
        person1.slowMoveVertical(200);
        kid1.slowMoveVertical(150);
        walkedAway = true;
    }
    }
    /**
     * Adult and kid sunset walk
     */
    public void sunsetWalk()
    {
        if(walkedAway == true){
        person1.slowMoveVertical(-200);
        kid1.slowMoveVertical(-150);
        walkedAway = false;
    }
    }
    // /**
     // * Sunset
     // */
    // public void sunset()
    // {
        // if(!sunSetted){
        // sun.slowMoveVertical(300);
        // walkedAway = true;
    // }
    // }
    // /**
     // * Adult and kid sunset walk
     // */
    // public void sunrise()
    // {
        // if(sunSetted == true){
        // sun.slowMoveVertical(-300);
        // walkedAway = false;
    // }
    // }
}
