package com.mygdx.game;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
//done
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthoCachedTiledMapRenderer;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.utils.viewport.Viewport;

import javax.swing.*;
import java.io.Serializable;

public class gamscreemImpl implements Screen, Serializable {
    final MyGdxGame game;
    Texture Ground ;
    Texture base;
    Texture health;
    Texture  fuel, backk;
    Tanks Player;
    Tanks Enemy;
    Texture bomb;
    Texture target;
    int aimy1=0;
    int aimx1=0;
    int aimx2=0;
    int aimy2=0;
    int n=0;
    int bomby=0;
    int bombx=0;
    private TmxMapLoader mapLoader;
    private Viewport gamePort;
    private OrthographicCamera gamecam;


    private TiledMap map;
    private OrthogonalTiledMapRenderer renderer;
    int tank1x=0;
    int tank2x=0;

    public gamscreemImpl(final MyGdxGame game){
        this.game=game;
        health=new Texture("pngtree-red-bar-image_1259222-removebg-preview.png");
        Ground =new Texture("background1-1.png");
        base=new Texture ("base.png");
        bomb=new Texture("bomb1.png");
        target=new Texture("target.png");
        Player=new tanks1();
        Enemy=new tankem();
        fuel=new Texture("fuel-removebg-preview.png");
        backk=new Texture("backkey.png");
    }
    @Override
    public void show() {

    }
    public void pausegame(){
        Pause ps=new Pause(game);
        game.setScreen(ps);
    }


    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.15f, 0.15f, 0.3f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);



        game.batch.begin();

        game.batch.draw(Ground,-50,-50,690,600);
        game.batch.draw(health,300,400,300,70);
        game.batch.draw(health,60,400,300,70);
        game.batch.draw(Player.tankimg,tank1x,90,70,70);
        //game.batch.draw(base, -50,-200 ,800, 600);
        game.batch.draw(Enemy.tankimg,560+tank2x,110,60,40);
        //game.batch.draw(fuel,560,250,100,50);
        //game.batch.draw(fuel,-20,250,100,50);
        game.batch.draw(backk, 10, 407 , 70, 50);
        game.batch.draw(bomb, 10+bombx, 90+bomby, 70, 50);
        game.batch.draw(target, tank1x+100+aimx1, 200+aimy1, 30, 30);
        game.batch.draw(target, +tank2x+510+aimx2, 200+aimy2, 30, 30);

        if (Gdx.input.justTouched()) {
            System.out.println("x=" + Gdx.input.getX() + " y=" + Gdx.input.getY());
}
        if(/*Gdx.input.isTouched()&&(Gdx.input.getX() > 20 && Gdx.input.getX()<72) && (Gdx.input.getY()>27 && Gdx.input.getY()<53)*/Gdx.input.isKeyPressed(Input.Keys.B) ){
            this.pausegame();
        }

        game.batch.end();

        if(Gdx.input.isKeyPressed(Input.Keys.N))
            if(n==1)
                n=2;
            else
                n=1;
        if (n==1) {
            if (Gdx.input.isKeyPressed(Input.Keys.D)) {
                tank1x += 1;
            }
            if (Gdx.input.isKeyPressed(Input.Keys.A)) {
                tank1x -= 1;
            }
            if(Gdx.input.isKeyPressed(Input.Keys.W)){
                aimy1+=1;
                aimx1-=1;
            }
            if(Gdx.input.isKeyPressed(Input.Keys.S)){
                aimy1-=1;
                aimx1+=1;
            }
//            if(Gdx.input.isKeyPressed(Input.Keys.W)&&Gdx.input.isKeyPressed(Input.Keys.A)){
//                aimy1+=1;
//                aimx1+=1;
//            }
            if (Gdx.input.isKeyPressed(Input.Keys.F)){
                //fire
                double tan=(100+aimx1-tank1x)/(200+aimy1-90);
                bombx+=1;
                bomby= -(int)( (bombx*tan)-(10*bombx*bombx)/(2*10*10*Math.cos(tan)));

            }
        }else {
            if (Gdx.input.isKeyPressed(Input.Keys.D)) {
                tank2x -= 1;
            }
            if (Gdx.input.isKeyPressed(Input.Keys.A)) {
                tank2x += 1;
            }
            if(Gdx.input.isKeyPressed(Input.Keys.W)){
                aimy2-=1;
                aimx2+=1;
            }
            if(Gdx.input.isKeyPressed(Input.Keys.S)){
                aimy2+=1;
                aimx2-=1;
            }
            if(Gdx.input.isKeyPressed(Input.Keys.F)){

            }
        }

        class MyTest {
            @Test
            public void testSum() {
                assertEquals(0,tank2x);
            }
        }
        class MyTest1 {
            @Test
            public void testSum() {
                assertEquals(0,tank2x);
            }
        }
        class MyTest2 {
            @Test
            public void testSum() {
                assertEquals(0,tank2x);
            }
        }
        class MyTest3 {
            @Test
            public void testSum() {
                assertEquals(0,tank2x);
            }
        }


    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}

