package edu.ntudp.chekushkin;

import edu.ntudp.chekushkin.controller.factories.UniversityFactory;
import edu.ntudp.chekushkin.view.UniversityView;

public class App {
    public static void main(String[] args) {
        var university = UniversityFactory.createTypicalUniversity();
        UniversityView.printUniversity(university);
    }
}
