package org.example.eum_example.enumBasedDesign.state_machine;

public enum TrafficLight {
    RED {
        @Override
        TrafficLight next() {
            return GREEN;
        }

        @Override
        String action() {
            return "STOP";
        }
    },
    YELLOW {
        @Override
        TrafficLight next() {
            return RED;
        }
        @Override
        String action() {
            return "CAUTION";
        }
    },
    GREEN {
        @Override
        TrafficLight next() {
            return YELLOW;
        }
        @Override
        String action() {
            return "GO";
        }
    };

    abstract TrafficLight next();
    abstract String action();

    public static void main(String[] args) {
        TrafficLight trafficLight = TrafficLight.RED;
        for (int i = 0; i < 6; i++) {
            System.out.println("Now i is "+ i + " traffic light is " + trafficLight.name() + ", and action is " + trafficLight.action());
            trafficLight = trafficLight.next();
        }
    }
}
