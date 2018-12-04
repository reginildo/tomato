/*
 * Copyright (C) 2018 Reginildo Sousa
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package io.github.reginildo.tomato;

class Tomato {

    private static int defaultLongBreakTime = 15;
    private static int defaultPomodoroTime = 25;
    private static int defaultShortBreakTime = 5;
    private static int longBreakTime, pomodoroTime, shortBreakTime;
    private static int ciclosTime = 4;

    static int getDefaultLongBreakTime() {
        return defaultLongBreakTime;
    }

    static void setDefaultLongBreakTime(int defaultLongBreakTime) {
        Tomato.defaultLongBreakTime = defaultLongBreakTime;
    }

    static int getDefaultPomodoroTime() {
        return defaultPomodoroTime;
    }

    static void setDefaultPomodoroTime(int defaultPomodoroTime) {
        Tomato.defaultPomodoroTime = defaultPomodoroTime;
    }

    static int getDefaultShortBreakTime() {
        return defaultShortBreakTime;
    }

    static void setDefaultShortBreakTime(int defaultShortBreakTime) {
        Tomato.defaultShortBreakTime = defaultShortBreakTime;
    }

    Tomato(int pomodo, int shortBreakTime, int longBreak) {
        setLongBreakTime(longBreak);
        setPomodoroTime(pomodo);
        setShortBreakTime(shortBreakTime);
    }

    static int getLongBreakTime() {
        return longBreakTime;
    }

    static void setLongBreakTime(int timeOfLongBreak) {
        longBreakTime = timeOfLongBreak;
    }

    static int getPomodoroTime() {
        return pomodoroTime;
    }

    static void setPomodoroTime(int timeOfPomodoro) {
        pomodoroTime = timeOfPomodoro;
    }

    static int getShortBreakTime() {
        return shortBreakTime;
    }

    static void setShortBreakTime(int timeOfShortBreak) {
        shortBreakTime = timeOfShortBreak;
    }

    public static int getCiclosTime() {
        return ciclosTime;
    }

    public static void setCiclosTime(int timeOfCiclos) {
        ciclosTime = timeOfCiclos;
    }
}
