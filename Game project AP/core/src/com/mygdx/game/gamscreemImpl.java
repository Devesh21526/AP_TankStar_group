package com.mygdx.game;
//done
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;

public class gamscreemImpl implements Screen {
    final MyGdxGame game;
    Texture Ground ;
    Texture base;
    Texture health;
    Texture  fuel, backk;
    Tanks Player;
    Tanks Enemy;
    public gamscreemImpl(final MyGdxGame game){
        this.game=game;
        health=new Texture("pngtree-red-bar-image_1259222-removebg-preview.png");
        Ground =new Texture("Background.jpg");
        base=new Texture ("base.png");
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
        game.batch.draw(Player.tankimg,0,170,80,80);
        game.batch.draw(base, -50,-200 ,800, 600);
        game.batch.draw(Enemy.tankimg,560,190,80,60);
        game.batch.draw(fuel,560,250,100,50);
        game.batch.draw(fuel,-20,250,100,50);
        game.batch.draw(backk, 10, 407 , 70, 50);
        if (Gdx.input.justTouched()) {
            System.out.println("x=" + Gdx.input.getX() + " y=" + Gdx.input.getY());
}
        if(Gdx.input.isTouched()&&(Gdx.input.getX() > 20 && Gdx.input.getX()<72) && (Gdx.input.getY()>27 && Gdx.input.getY()<53) ){
            this.pausegame();
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
