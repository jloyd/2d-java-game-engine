/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mapeditor;

import java.awt.Image;


/**
 *
 * @author Basti
 */
public class Tiles {

    public int x = 0;
    public int y = 0;
    public boolean good=false;
    public Image tileImage;

    public Tiles(int x, int y){
        this.x = 16*(x-1);
        this.y = 16*(y-1);
        tileImage = MapEditor.tiles;
    }
    
    public Tiles(int x, int y, Image tileImage){
        this.tileImage = tileImage;
        while(tileImage.getWidth(null) == -1){
            this.x = tileImage.getWidth(null)*(x-1);
            this.y = tileImage.getWidth(null)*(y-1);
            System.out.println("width of tile image still -1");
        }
    }
    
    public Tiles(Image tileImage){
        this.tileImage = tileImage;
        while(tileImage.getWidth(null) == -1){
            System.out.println("width of tile image still -1");
        }
        this.x = tileImage.getWidth(null);
        this.y = tileImage.getWidth(null);
    }
    
    public void setImage(Image img){
        while(img.getWidth(null) == -1 || tileImage.getWidth(null) == -1){
            System.out.println("width of tile image still -1");
        }
        int tempx = tileImage.getWidth(null);
        this.tileImage = img;
        x = (x/tempx) * tileImage.getWidth(null);
        y = (y/tempx) * tileImage.getWidth(null);
    }

    public void setPart(int c, int r){
        x = 16*(c-1);
        y = 16*(r-1);
    }
/*
    public void fill(int x, int y, int a, int b){
        if (this.x != a){
            setPart(a,b);
            if (x>0){
                if (Map.tile[x-1][y].x == Map.fillx){
                    Map.tile[x-1][y].fill(x-1,y,a,b);
                }
            }
            if (x<Map.maxWidth/16){
                if (Map.tile[x+1][y].x == Map.fillx){
                    Map.tile[x+1][y].fill(x+1,y,a,b);
                }
            }
            if (y>0){
                if (Map.tile[x][y-1].x == Map.fillx){
                    Map.tile[x][y-1].fill(x,y-1,a,b);
                }
            }
            if (y<Map.maxHeight/16){
                if (Map.tile[x][y+1].x == Map.fillx){
                    Map.tile[x][y+1].fill(x,y+1,a,b);
                }
            }
        System.out.println("filled "+x+" "+y);
        }
    }*/

    //sort the tiles "magically" :)
    public void magic(int a, int b){
        good = false;
        if (this.x<=112&&this.y>=0){
            good = true;
            if (a>0 && b>0){
                if (Map.tile[a-1][b].good==false&&Map.tile[a][b-1].good==false){
                    this.x =0;
                }
                else{
                    if (Map.tile[a-1][b].good==false){
                        this.x =64;
                    }
                }
            }
            if (a<Map.maxWidth/16 && b>0){
                if (Map.tile[a+1][b].good==false&&Map.tile[a][b-1].good==false){
                    this.x =16;
                }
                else{
                    if (Map.tile[a+1][b].good==false){
                        this.x =80;
                    }
                }
            }
            if (a<Map.maxWidth/16 && b>0 && a>0){
                if (Map.tile[a+1][b].good==true && Map.tile[a-1][b].good==true && Map.tile[a][b-1].good==false){
                    this.x = 96;
                }
                if (Map.tile[a+1][b].good==true && Map.tile[a-1][b].good==true && Map.tile[a][b-1].good==true){
                    this.x = 112;
                }
                if (Map.tile[a-1][b-1].good==false && Map.tile[a-1][b].good==true && Map.tile[a][b-1].good==true){
                    this.x = 48;
                }
                if (Map.tile[a+1][b-1].good==false && Map.tile[a+1][b].good==true && Map.tile[a][b-1].good==true){
                    this.x = 32;
                }
            }
        }
    }
}