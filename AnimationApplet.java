import java.awt.*;

public class AnimationApplet extends java.applet.Applet implements java.lang.Runnable {
    public void start() {
        animationThread = new Thread(this);
        animationThread.start();
    }
    public void stop() {
        animationThread = null;
    }
    public void run() {
        while (Thread.currentThread() == animationThread) {
            try{
                Thread.currentThread().sleep(delay);
            } catch (InterruptedException e) {}
            repaint();
        }
    }
    final public void setDelay(int delay) {
        this.delay = delay;
    }
    final public int getDelay() {
        return delay;
    }
    protected Thread animationThread;
    protected int delay = 100;
}