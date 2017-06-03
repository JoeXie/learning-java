package ui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Xie on 2017.1.11.
 */
public class Lay {

    /**
     * 常量属性:
     */
    // 图形对象
    private static final Image WINDOW_IMG = new ImageIcon("Graphics/window/Window.png").getImage();
    private static final int WINDOW_SIZE = 7; // 图形边界宽度7个像素
    private static final int WINDOW_WIDTH = WINDOW_IMG.getWidth(null);
    private static final int WINDOW_HEIGHT = WINDOW_IMG.getHeight(null);



    /**
     * 左上角x坐标
     */
    private int x;

    /**
     * 左上角y坐标
     */
    private int y;

    /**
     * 图像宽度
     */
    private int width;

    /**
     * 图形高度
     */
    private int height;

    /**
     * 构造函数
     * @param x
     * @param y
     * @param width
     * @param height
     */
    public Lay(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    /**
     * 绘制图形方法
     * @param g
     */
    public void createWindow(Graphics g) {
        // 左上
        g.drawImage(WINDOW_IMG, x, y, x+WINDOW_SIZE, y+WINDOW_SIZE,
                0, 0, WINDOW_SIZE, WINDOW_SIZE, null);
        // 右上
        g.drawImage(WINDOW_IMG, x+width - WINDOW_SIZE, y, x+width, y+WINDOW_SIZE,
                WINDOW_WIDTH - WINDOW_SIZE, 0, WINDOW_WIDTH, WINDOW_SIZE, null);
        // 左下
        g.drawImage(WINDOW_IMG, x, y+height - WINDOW_SIZE, x+WINDOW_SIZE, y+height,
                0, WINDOW_HEIGHT - WINDOW_SIZE, WINDOW_SIZE, WINDOW_HEIGHT, null);
        // 右下
        g.drawImage(WINDOW_IMG, x+width - WINDOW_SIZE, y+height - WINDOW_SIZE, x+width, y+height,
                WINDOW_WIDTH - WINDOW_SIZE, WINDOW_HEIGHT - WINDOW_SIZE, WINDOW_WIDTH, WINDOW_HEIGHT, null);
        // 上
        g.drawImage(WINDOW_IMG, x+WINDOW_SIZE, y, x+width - WINDOW_SIZE, y+WINDOW_SIZE,
                WINDOW_SIZE, 0, WINDOW_WIDTH - WINDOW_SIZE, WINDOW_SIZE,null);
        // 下
        g.drawImage(WINDOW_IMG, x+WINDOW_SIZE, y+height - WINDOW_SIZE, x+width - WINDOW_SIZE, y+height,
                WINDOW_SIZE, WINDOW_HEIGHT - WINDOW_SIZE, WINDOW_WIDTH - WINDOW_SIZE, WINDOW_HEIGHT,null);
        // 左
        g.drawImage(WINDOW_IMG, x, y+WINDOW_SIZE, x+WINDOW_SIZE, y+height - WINDOW_SIZE,
                0, WINDOW_SIZE, WINDOW_SIZE, WINDOW_HEIGHT - WINDOW_SIZE, null);
        // 右
        g.drawImage(WINDOW_IMG, x+width - WINDOW_SIZE, y+WINDOW_SIZE, x+width, y+height-WINDOW_SIZE,
                WINDOW_WIDTH - WINDOW_SIZE, WINDOW_SIZE, WINDOW_WIDTH, WINDOW_HEIGHT-WINDOW_SIZE, null);
    }

}
