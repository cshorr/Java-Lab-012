import java.util.ArrayList;
import java.util.List;

class Simulation {
    public static void main(String[] args) {
        // Main simulation logic
        SolarSystem ss = new SolarSystem();
        Sun theSun = new Sun ("The Sun",696340,1989e30, 5773);
        Planet planet = new Planet ( "earth", 6371, 5.972e24,1.496e8, 17000,25000);
        ss.addSun(theSun);
        ss.addPlanet (planet);
        ss.showPlanets();
        ss.movePlanets();
    }
}

