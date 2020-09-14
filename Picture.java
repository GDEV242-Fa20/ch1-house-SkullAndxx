/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Erick Rubio
 * @version 2020.09.13
 */
public class Picture
{
    private Square sky;
    private Square ground;
    //private Triangle roof;
    private Person person1;
    private Person kid1;
    private Circle sun;
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
    
            person1.changeSize(100, 40);
            person1.moveHorizontal(-60);
            person1.moveVertical(100);
            person1.makeVisible();
            person1.slowMoveVertical(-155);
    
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
        ground.changeColor("white");
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
        person1.changeColor("black");
        kid1.changeColor("black");

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
