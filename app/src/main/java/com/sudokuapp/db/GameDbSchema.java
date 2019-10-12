package com.sudokuapp.db;

public class GameDbSchema {

    public static final class Users{
        public static final String NAME = "users";

        public static final class Cols {
            public static final String ID       = "id   ";
            public static final String NAME     = "name ";
            public static final String DATE     = "date ";
            public static final String EMAIL    = "email";
        }
    }

    public static final class Games{
        public static final String NAME = "games";

        public static final class Cols{
            public static final String ID           = "id           ";
            public static final String USER_ID      = "user_id      ";
            public static final String TABLE_I      = "table_i      ";
            public static final String TABLE_J      = "table_j      ";
            public static final String KNOW_TAB_I   = "know_tab_i   ";
            public static final String KNOW_TAB_J   = "know_tab_j   ";
            public static final String TIME         = "time         ";
        }
    }

    public static final class Result{
        public static final String NAME = "result";

        public static final class Cols{
            public static final String USER_ID = "user_id";
            public static final String GAME_ID = "game_id";
            public static final String TIME_RESULT = "time_result";
        }
    }
}
