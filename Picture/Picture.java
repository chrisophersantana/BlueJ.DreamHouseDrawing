
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    { 
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-70);
        window.moveVertical(-50);
        window.changeSize(600);
        window.makeVisible();
        
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();
       
        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();
        
        
        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(60);
        window.moveVertical(100);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(40);
        window.moveVertical(100);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(40);
        window.moveVertical(150);
        window.makeVisible();

        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("white");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
        
        sun = new Circle();
        sun.changeColor("black");
        sun.moveHorizontal(190);
        sun.moveVertical(8);
        sun.changeSize(10);
        sun.makeVisible();
        
         sun = new Circle();
        sun.changeColor("black");
        sun.moveHorizontal(220);
        sun.moveVertical(8);
        sun.changeSize(10);
        sun.makeVisible();
        
        window = new Square();
        window.changeColor("green");
        window.moveHorizontal(-70);
        window.moveVertical(180);
        window.changeSize(600);
        window.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
