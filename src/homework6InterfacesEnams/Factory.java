package homework6InterfacesEnams;

import java.util.Random;

public class Factory implements Assemble {
    Random random = new Random();

    @Override
    public  Head createHead() {
        Head [] heads = new Head[3];
        heads [0] = Head.OUTDATED_HEAD;
        heads [1] = Head.CLASSIC_HEAD;
        heads [2] = Head.MODERN_HEAD;
        int i = (int) (Math.random()*3);
        return heads [i];
    }

    @Override
    public Body createBody() {
        Body[] bodies = new Body[3];
        bodies [0] = Body.OUTDATED_BODY;
        bodies [1] = Body.CLASSIC_BODY;
        bodies [2] = Body.MODERN_BODY;
        int i = (int) (Math.random()*3);
        return bodies [i];
    }
}
