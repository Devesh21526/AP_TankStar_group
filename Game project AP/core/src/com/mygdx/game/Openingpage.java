package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;

public class Openingpage implements Screen {
    final MyGdxGame game;
    Texture Open;
    Texture title;
    public Openingpage(final MyGdxGame game){
        this.game=game;
        Open=new Texture("MainMenu.jpg");
        title=new Texture("logo.png");
    }
    public void next(){
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
        game.batch.draw(Open,-50,-50,700,600);
        game.batch.draw(title, 200, 0 , 200, 100);
        if(Gdx.input.isTouched()&&(Gdx.input.getX()> 0 && Gdx.input.getX()<1000) && (Gdx.input.getY()>0 && Gdx.input.getY()<1000) ){
            this.next();
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
