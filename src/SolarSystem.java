import java.util.ArrayList;
import java.util.List;

class SolarSystem {
    private List<Planet> planets;
    private Sun theSun;

    public SolarSystem() {
        planets = new ArrayList<>();
    }

    public void addPlanet(Planet planet) {
        planets.add(planet);
    }

    public void addSun(Sun aSun) {
        theSun = aSun;
    }

    public void showPlanets() {
        for (Planet planet : planets) {
            System.out.println(planet.toString());
        }
    }

    public void movePlanets() {
        // Logic to move planets

            double G = 0.1;
            double dt = 0.001;

            for(Planet p : this.planets) {
                p.moveTo(p.getX() + dt * p.getXVel(),
                        p.getY() + dt * p.getYVel());

                double rx = this.theSun.getX() - p.getX();
                double ry = this.theSun.getY() - p.getY();
                double r = Math.sqrt(Math.pow(rx, 2) + Math.pow(ry, 2));

                double accX = G * this.theSun.getMass() * rx / Math.pow(r, 3);
                double accY = G * this.theSun.getMass() * ry / Math.pow(r, 3);

                p.setXVel(p.getXVel() + dt * accX);
                p.setYVel(p.getYVel() + dt * accY);
            }
        }
    }

