package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.Hexagon;
import edu.eci.cvds.patterns.shapes.concrete.Pentagon;
import edu.eci.cvds.patterns.shapes.concrete.Quadrilateral;
import edu.eci.cvds.patterns.shapes.concrete.Triangle;

public interface ShapeFactory {
    static Shape create(RegularShapeType type) {
        switch (type){
            case Hexagon:
                return new Hexagon();
            case Pentagon:
                return new Pentagon();
            case Triangle:
                return new Triangle();
            case Quadrilateral:
                return new Quadrilateral();
            default:
                return null;
        }
    }
}
