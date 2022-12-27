package com.mygdx.game;
//completed
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;

public class Pause implements Screen {
    final MyGdxGame game;
    Texture screen;
    Texture Exit;
    Texture resume;
    Texture save, newg, pause, Logo;
    public Pause(final MyGdxGame game){
        this.game=game;
        screen=new Texture("back.png");
        Exit=new Texture("exit.png");
        newg=new Texture("newg.png");
        resume=new Texture ("Resume.png");
        save=new Texture("sg.png");
        pause=new Texture("pm.png");
        Logo=new Texture("logo.png");
    }
    public void rsume(){
        gamscreemImpl gs= new gamscreemImpl(game);
        game.setScreen(gs);
    }
    public void savedg(){
        Savedgames sg= new Savedgames(game);
        game.setScreen(sg);
    }
    public void newgm(){
        Mainmenu mn=new Mainmenu(game);
        game.setScreen(mn);
    }
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.15f, 0.15f, 0.3f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.begin();
        game.batch.draw(screen,-10,-50,700,600);
        game.batch.draw(Logo, 210, 0 , 200, 100);
        game.batch.draw(Exit,200,100,200,85);
        game.batch.draw(newg,215,170,200,65);
        game.batch.draw(resume,205,293,200,75);
        game.batch.draw(pause,105,343,400,150);
        game.batch.draw(save,205,240,194,55);
        if (Gdx.input.justTouched()) {
            System.out.println("x=" + Gdx.input.getX() + " y=" + Gdx.input.getY());
        }
        if(/*Gdx.input.isTouched()&&(Gdx.input.getX() > 222 && Gdx.input.getX()<383) && (Gdx.input.getY()>121 && Gdx.input.getY()<167)*/Gdx.input.isKeyPressed(Input.Keys.R) ){
            this.rsume();
        }
        if(Gdx.input.isKeyPressed(Input.Keys.S) ){
            this.savedg();
        }
        if(Gdx.input.isKeyPressed(Input.Keys.N) ){
            this.newgm();
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
