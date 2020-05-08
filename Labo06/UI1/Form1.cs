using System;
using System.Drawing;
using System.Collections.Generic;
using System.Windows.Forms;

namespace UI1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            comboBox1.DataSource = new List<String>() {"Morado", "Naranja", "Rosado"};

        }

        private void buttonRed_Click(object sender, EventArgs e)
        {
            BackColor = Color.DarkRed;
        }

        private void buttonBlue_Click(object sender, EventArgs e)
        {
            BackColor = Color.DarkSlateBlue;
        }

        private void buttonGreen_Click(object sender, EventArgs e)
        {
            BackColor = Color.PaleGreen;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            BackColor = ColorTranslator.FromHtml("#" + textBox1.Text);
        }

        private void button2_Click(object sender, EventArgs e)
        {
            String morado = "#c45ced", naranja = "#e66a30", rosado= "#f0b1df";

            switch (comboBox1.SelectedIndex)
            {
                case 0:
                    BackColor = ColorTranslator.FromHtml(morado);
                    break;
                case 1:
                    BackColor = ColorTranslator.FromHtml(naranja);
                    break;
                case 2:
                    BackColor = ColorTranslator.FromHtml(rosado);
                    break;
                
            }
            
        }
    }
}