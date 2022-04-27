package com.example.stellarisspeciesrandomizer;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class DLCPage extends AppCompatActivity {
    public static boolean hasAquaticDlc;
    public static boolean hasHumanoidDlc;
    public static boolean hasSyntheticDlc;
    public static boolean hasPlantoidDlc;
    public static boolean hasLithoidDlc;
    public static boolean hasNecroidDlc;
    public static boolean hasAncientDlc;
    public static boolean hasFederationsDlc;
    public static boolean hasApocalypseDlc;
    public static boolean hasUtopiaDlc;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.dlc_page);
        Button doneButton = (Button) findViewById(R.id.button_done);
        doneButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
        }});
            ImageButton aquaticsCheckbox = (ImageButton) findViewById(R.id.aquatic_checkbox);
            aquaticsCheckbox.setTag("1");
            aquaticsCheckbox.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (aquaticsCheckbox.getTag() == "1") {
                        aquaticsCheckbox.setImageResource(R.drawable.checked);
                        aquaticsCheckbox.setTag("2");
                        hasAquaticDlc = true;
                    } else if (aquaticsCheckbox.getTag() == "2") {
                        aquaticsCheckbox.setImageResource(R.drawable.checkmark);
                        aquaticsCheckbox.setTag("1");
                        hasAquaticDlc = false;
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
                        hasHumanoidDlc = true;
                    } else if (humanoidCheckbox.getTag() == "2") {
                        humanoidCheckbox.setImageResource(R.drawable.checkmark);
                        humanoidCheckbox.setTag("1");
                        hasHumanoidDlc = false;
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
                        hasPlantoidDlc = true;
                    } else if (plantoidCheckbox.getTag() == "2") {
                        plantoidCheckbox.setImageResource(R.drawable.checkmark);
                        plantoidCheckbox.setTag("1");
                        hasPlantoidDlc = false;
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
                        hasSyntheticDlc = true;
                    } else if (syntheticCheckbox.getTag() == "2") {
                        syntheticCheckbox.setImageResource(R.drawable.checkmark);
                        syntheticCheckbox.setTag("1");
                        hasSyntheticDlc = false;
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
                        hasNecroidDlc = true;
                    } else if (necroidCheckbox.getTag() == "2") {
                        necroidCheckbox.setImageResource(R.drawable.checkmark);
                        necroidCheckbox.setTag("1");
                        hasNecroidDlc = false;
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
                        hasLithoidDlc = true;
                    } else if (lithoidCheckbox.getTag() == "2") {
                        lithoidCheckbox.setImageResource(R.drawable.checkmark);
                        lithoidCheckbox.setTag("1");
                        hasLithoidDlc = false;
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
                    hasAncientDlc = true;
                } else if (ancientCheckbox.getTag() == "2") {
                    ancientCheckbox.setImageResource(R.drawable.checkmark);
                    ancientCheckbox.setTag("1");
                    hasAncientDlc = false;
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
                    hasFederationsDlc = true;
                } else if (federationsCheckbox.getTag() == "2") {
                    federationsCheckbox.setImageResource(R.drawable.checkmark);
                    federationsCheckbox.setTag("1");
                    hasFederationsDlc = false;
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
                    hasApocalypseDlc = true;
                } else if (apocalypseCheckbox.getTag() == "2") {
                    apocalypseCheckbox.setImageResource(R.drawable.checkmark);
                    apocalypseCheckbox.setTag("1");
                    hasApocalypseDlc = false;
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
                    hasUtopiaDlc = true;
                } else if (utopiaCheckbox.getTag() == "2") {
                    utopiaCheckbox.setImageResource(R.drawable.checkmark);
                    utopiaCheckbox.setTag("1");
                    hasUtopiaDlc = false;
                }
            }

        });

        }
    }
