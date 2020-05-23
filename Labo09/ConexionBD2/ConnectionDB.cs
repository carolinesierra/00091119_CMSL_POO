
using System.Data;
using Npgsql;

namespace ConexionBD2
{
    public static class ConnectionDB
    {
        private static string 
           
host = "ec2-34-206-31-217.compute-1.amazonaws.com",
            database = "d54pltoc5pt4pa",
            userID = "avwicysetbevcp",
            password = "c568a763a0b2c2f9fee5c878d45f46a51a9363ec0389ce4053e6252b6de4724d";

        private static string sConnection = $"Host={host};Port = 5432; User Id = {userID}; " +
                                            $"Password={password};Database={database};"+ 
                                            "sslmode=Require;Trust Server Certificate=true";
        public static DataTable ExecuteQuery(string query)
        {
            NpgsqlConnection connection = new NpgsqlConnection(sConnection);
            DataSet ds = new DataSet();
            connection.Open();
            NpgsqlDataAdapter da = new NpgsqlDataAdapter(query, connection);
            da.Fill(ds);
            connection.Close();
            return ds.Tables[0];
        }

        public static void ExecuteNonQuery(string action)
        {
            NpgsqlConnection connection = new NpgsqlConnection(sConnection);
            connection.Open();
            NpgsqlCommand command = new NpgsqlCommand(action, connection);
            command.ExecuteNonQuery();

            connection.Close();
        }
    }
}