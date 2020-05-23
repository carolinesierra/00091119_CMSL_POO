using System;
using System.Windows.Forms;

namespace ConexionBD2
{
    public partial class RegisterStudent : UserControl
    {
        public RegisterStudent()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if(textBox1.Text.Equals("") ||
            textBox2.Text.Equals("") ||
            textBox3.Text.Equals("") ||
            textBox4.Text.Equals(""))
            {
                MessageBox.Show("No se puede dejar campos vacios");
            }
            else
            {
                try
                {
                    ConnectionDB.ExecuteNonQuery($"INSERT INTO ESTUDIANTE VALUES(" +
                                                 $"'{textBox3.Text}'," +
                                                 $"'{textBox1.Text}'," +
                                                 $"'{textBox2.Text}'," +
                                                 $"{textBox4.Text})");

                    MessageBox.Show("Se ha registrado estudiante");
                }
                catch (Exception ex)
                {
                    MessageBox.Show("Ocurrió un error.");
                }
            }
        }
    }
}