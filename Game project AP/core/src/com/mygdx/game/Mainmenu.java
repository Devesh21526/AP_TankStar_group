package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import jdk.javadoc.internal.tool.Start;

public class Mainmenu implements Screen {
    final MyGdxGame game;
    Texture Menu;
    Texture Logo;
    Texture start;
    Texture resume;
    Texture exit, nex, pre;
    Tanks t1, t2, t3;




    public Mainmenu(final MyGdxGame game){
        this.game=game;
        Menu=new Texture("back.png");
        start=new Texture("newg.png");
        resume=new Texture("sg.png");
        exit=new Texture("exit.png");
        Logo=new Texture("logo.png");
        nex=new Texture("next.png");
        pre=new Texture("prev.png");
        t1=new tanks1();
        t2=new tank2();
        t3= new tank3();
    }
    public void tanksn(){
        Mainmenu2 mn=new Mainmenu2(game);
        game.setScreen(mn);
    }
    public void tanksn2(){
        Mainmenu3 mn2=new Mainmenu3(game);
        game.setScreen(mn2);
    }
    public void Startgame(){
        gamscreemImpl gs= new gamscreemImpl(game);
        game.setScreen(gs);
    }
    public void Saved(){
        Savedgames gs = new Savedgames(game);
        game.setScreen(gs);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.15f, 0.15f, 0.3f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.begin();
        game.batch.draw(Menu,-50,-50,800,600);
        game.batch.draw(Logo, 50, 350 ,200, 100);
        game.batch.draw(start,335,350,200,75);
        game.batch.draw(exit,335,50,200,90);
        game.batch.draw(resume,335,200,200,63);
        game.batch.draw(nex,268,140,50,50);
        game.batch.draw(pre,25,140,50,50);
        game.batch.draw(t1.tankimg,68,70,200,200);
        if(Gdx.input.isTouched()&&((Gdx.input.getX() > 279 && Gdx.input.getX()<305) && (Gdx.input.getY()>291 && Gdx.input.getY()<322)) ){
            this.tanksn();
            //game.batch.draw(t2.tankimg,68,70,200,200);
        }
        if(Gdx.input.isTouched()&&((Gdx.input.getX() > 33 && Gdx.input.getX()<58) && (Gdx.input.getY()>291 && Gdx.input.getY()<322)) ){
            this.tanksn2();
            //game.batch.draw(t2.tankimg,68,70,200,200);
        }


        if(Gdx.input.isTouched()&&((Gdx.input.getX() > 337 && Gdx.input.getX()<512) && (Gdx.input.getY()>61 && Gdx.input.getY()<109)) ){
           this.Startgame();
        }
        if(Gdx.input.isTouched()&&((Gdx.input.getX() > 337 && Gdx.input.getX()<512) && (Gdx.input.getY()>222 && Gdx.input.getY()<265)) ){
            this.Saved();
        }

        if (Gdx.input.justTouched()) {
            System.out.println("x=" + Gdx.input.getX() + " y=" + Gdx.input.getY());
        }
        game.batch.end();
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
