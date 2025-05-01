package org.example.eum_example.enumBasedDesign.command_pattern;

public enum Command {
    START {
        @Override
        void execute() {
            System.out.println("Start.....");
        }
    },
    STOP {
        @Override
        void execute() {
            System.out.println("Stop....");
        }
    },
    RESTART {
        @Override
        void execute() {
            System.out.println("Restart.....");
        }
    };

    abstract void execute();

    public static void main(String[] args) {
        for (Command command : Command.values()) {
            command.execute();
        }
    }
}
