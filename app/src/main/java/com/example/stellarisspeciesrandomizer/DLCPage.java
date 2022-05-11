package com.example.stellarisspeciesrandomizer;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class DLCPage extends AppCompatActivity {
    public static int[] DLCArray;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.dlc_page);
        try {
            File myObj = new File("hasDLC.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        DLCArray = new int[1];
        Button doneButton = (Button) findViewById(R.id.button_done);
        doneButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) throws IOException {
                writeToFile();
                finish();
        }});
            ImageButton aquaticsCheckbox = (ImageButton) findViewById(R.id.aquatic_checkbox);
            aquaticsCheckbox.setTag("1");
            //hello
            aquaticsCheckbox.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (aquaticsCheckbox.getTag() == "1") {
                        aquaticsCheckbox.setImageResource(R.drawable.checked);
                        aquaticsCheckbox.setTag("2");
                        DLCArray[0] = 1;
                    } else if (aquaticsCheckbox.getTag() == "2") {
                        aquaticsCheckbox.setImageResource(R.drawable.checkmark);
                        aquaticsCheckbox.setTag("1");
                        DLCArray[0] = 0;
                    }
                }

            });
            ImageButton humanoidCheckbox = (ImageButton) findViewById(R.id.humanoid_checkbox);
            humanoidCheckbox.setTag("1");
            humanoidCheckbox.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (humanoidCheckbox.getTag() == "1") {
                        humanoidCheckbox.setImageResource(R.drawable.checked);
                        humanoidCheckbox.setTag("2");
                        DLCArray[1] = 1;
                    } else if (humanoidCheckbox.getTag() == "2") {
                        humanoidCheckbox.setImageResource(R.drawable.checkmark);
                        humanoidCheckbox.setTag("1");
                        DLCArray[1] = 0;
                    }
                }

            });
            ImageButton plantoidCheckbox = (ImageButton) findViewById(R.id.plantoid_checkbox);
            plantoidCheckbox.setTag("1");
            plantoidCheckbox.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (plantoidCheckbox.getTag() == "1") {
                        plantoidCheckbox.setImageResource(R.drawable.checked);
                        plantoidCheckbox.setTag("2");
                        DLCArray[2] = 1;
                    } else if (plantoidCheckbox.getTag() == "2") {
                        plantoidCheckbox.setImageResource(R.drawable.checkmark);
                        plantoidCheckbox.setTag("1");
                        DLCArray[2] = 0;
                    }
                }

            });
            ImageButton syntheticCheckbox = (ImageButton) findViewById(R.id.synthetic_checkbox);
            syntheticCheckbox.setTag("1");
            syntheticCheckbox.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (syntheticCheckbox.getTag() == "1") {
                        syntheticCheckbox.setImageResource(R.drawable.checked);
                        syntheticCheckbox.setTag("2");
                        DLCArray[3] = 1;
                    } else if (syntheticCheckbox.getTag() == "2") {
                        syntheticCheckbox.setImageResource(R.drawable.checkmark);
                        syntheticCheckbox.setTag("1");
                        DLCArray[3] = 0;
                    }
                }

            });
            ImageButton necroidCheckbox = (ImageButton) findViewById(R.id.necroids_checkbox);
            necroidCheckbox.setTag("1");
            necroidCheckbox.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (necroidCheckbox.getTag() == "1") {
                        necroidCheckbox.setImageResource(R.drawable.checked);
                        necroidCheckbox.setTag("2");
                        DLCArray[4] = 1;
                    } else if (necroidCheckbox.getTag() == "2") {
                        necroidCheckbox.setImageResource(R.drawable.checkmark);
                        necroidCheckbox.setTag("1");
                        DLCArray[4] = 0;
                    }
                }

            });
            ImageButton lithoidCheckbox = (ImageButton) findViewById(R.id.lithoids_checkbox);
            lithoidCheckbox.setTag("1");
            lithoidCheckbox.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (lithoidCheckbox.getTag() == "1") {
                        lithoidCheckbox.setImageResource(R.drawable.checked);
                        lithoidCheckbox.setTag("2");
                        DLCArray[5] = 1;
                    } else if (lithoidCheckbox.getTag() == "2") {
                        lithoidCheckbox.setImageResource(R.drawable.checkmark);
                        lithoidCheckbox.setTag("1");
                        DLCArray[5] = 0;
                    }
                }

            });
            ImageButton ancientCheckbox = (ImageButton) findViewById(R.id.ancient_checkbox);
            ancientCheckbox.setTag("1");
            ancientCheckbox.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (ancientCheckbox.getTag() == "1") {
                    ancientCheckbox.setImageResource(R.drawable.checked);
                    ancientCheckbox.setTag("2");
                    DLCArray[6] = 1;
                } else if (ancientCheckbox.getTag() == "2") {
                    ancientCheckbox.setImageResource(R.drawable.checkmark);
                    ancientCheckbox.setTag("1");
                    DLCArray[6] = 0;
                }
            }

        });
            ImageButton federationsCheckbox = (ImageButton) findViewById(R.id.federations_checkbox);
            federationsCheckbox.setTag("1");
            federationsCheckbox.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (federationsCheckbox.getTag() == "1") {
                    federationsCheckbox.setImageResource(R.drawable.checked);
                    federationsCheckbox.setTag("2");
                    DLCArray[7] = 1;
                } else if (federationsCheckbox.getTag() == "2") {
                    federationsCheckbox.setImageResource(R.drawable.checkmark);
                    federationsCheckbox.setTag("1");
                    DLCArray[7] = 0;
                }
            }

        });
            ImageButton apocalypseCheckbox = (ImageButton) findViewById(R.id.apocalypse_checkbox);
            apocalypseCheckbox.setTag("1");
            apocalypseCheckbox.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (apocalypseCheckbox.getTag() == "1") {
                    apocalypseCheckbox.setImageResource(R.drawable.checked);
                    apocalypseCheckbox.setTag("2");
                    DLCArray[8] = 1;
                } else if (apocalypseCheckbox.getTag() == "2") {
                    apocalypseCheckbox.setImageResource(R.drawable.checkmark);
                    apocalypseCheckbox.setTag("1");
                    DLCArray[8] = 0;
                }
            }

        });
            ImageButton utopiaCheckbox = (ImageButton) findViewById(R.id.utopia_checkbox);
            utopiaCheckbox.setTag("1");
            utopiaCheckbox.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (utopiaCheckbox.getTag() == "1") {
                    utopiaCheckbox.setImageResource(R.drawable.checked);
                    utopiaCheckbox.setTag("2");
                    DLCArray[9] = 1;
                } else if (utopiaCheckbox.getTag() == "2") {
                    utopiaCheckbox.setImageResource(R.drawable.checkmark);
                    utopiaCheckbox.setTag("1");
                    DLCArray[9] = 0;
                }
            }

        });
            }
        public static void writeToFile() throws IOException {
            int len = DLCArray.length;
            for (int i = 0; i < len; i++) {
                FileWriter writer = new FileWriter("hasDLC.txt");
                writer.write(DLCArray[i] + "\t"+ "");
            }
        }
    }
