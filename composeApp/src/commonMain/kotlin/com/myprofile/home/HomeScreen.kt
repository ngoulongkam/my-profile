package com.myprofile.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import com.myprofile.certification.CertificationScreen
import com.myprofile.skill.SkillScreen
import org.jetbrains.compose.resources.InternalResourceApi

object HomeScreen : Screen {
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.current

        MaterialTheme {
            Column(
                Modifier
                    .fillMaxWidth()
                    .verticalScroll(rememberScrollState())
            ) {
                HalfColorBoxWithImage()

                FourDpSpacer()

                Card {
                    Column {
                        Text(
                            "About",
                            modifier = Modifier.fillMaxWidth().padding(16.dp)
                        )

                        Text(
                            "Experienced Android developer/Test Engineer with a demonstrated history of working in mobile application development, with experiences in government/financial applications. \n" +
                                    "\n" +
                                    "Skill highlight:\n" +
                                    "- Android native application development with Kotlin, Android Jetpack, Navigation component, MVVM, Coroutine, Hilt, Retrofit and many more. \n" +
                                    "- Strong understanding of automation tests, such as UI tests with Espresso, Kakao, Karumi-Shot for screenshot tests, JUnit, and Mockito for unit tests.\n" +
                                    "- DevOps knowledge with Bitrise and Jenkins.\n" +
                                    "- Kotlin Multiplatform knowledge (KMP), being able to deliver KMP library for different consumers such as iOS/Android/Web service.\n" +
                                    "- Knowledge of analytic integration such as Google Analytics, Firebase and Splunk.\n" +
                                    "- Bash scripting, Fastlane, Gradle knowledge for task automation.\n" +
                                    "- Selenium, ScalaTest, and Cucumber knowledge for web/API automation test.\n" +
                                    "- Performance testing utilising the Gatling load tool. \n" +
                                    "- Security testing utilising MobSF for mobile and OWASP ZAP for web applications.",
                            modifier = Modifier.fillMaxWidth().padding(16.dp)
                        )
                    }
                }

                FourDpSpacer()

                Card {
                    Column {
                        Text(
                            "Experience",
                            modifier = Modifier.fillMaxWidth().padding(16.dp)
                        )

                        Text(
                            "Cagemini - Android Developer - 8 years 9 months",
                            modifier = Modifier.fillMaxWidth().padding(16.dp)
                        )
                    }
                }

                FourDpSpacer()

                Card {
                    Column {
                        Text(
                            "Education",
                            modifier = Modifier.fillMaxWidth().padding(16.dp)
                        )

                        Text(
                            "Kingston University - Computer Science - 2011-2014",
                            modifier = Modifier.fillMaxWidth().padding(16.dp)
                        )
                    }
                }


                FourDpSpacer()

                Card {
                    Column {
                        Text(
                            "Licenses & certifications",
                            modifier = Modifier.fillMaxWidth().padding(16.dp)
                        )

                        Text(
                            "ASTQB Certified Mobile Tester - BCS, The Chartered Institute for IT",
                            modifier = Modifier.fillMaxWidth().padding(16.dp)
                        )

                        Button(
                            onClick = { navigator?.push(CertificationScreen) },
                            modifier = Modifier.fillMaxWidth().padding(16.dp)
                        ) {
                            Text("View all")
                        }
                    }
                }

                FourDpSpacer()

                Card {
                    Column {
                        Text(
                            "Skills",
                            modifier = Modifier.fillMaxWidth().padding(16.dp)
                        )

                        Text(
                            "Compose Multiplatform (CMP)",
                            modifier = Modifier.fillMaxWidth().padding(16.dp)
                        )

                        Button(
                            onClick = { navigator?.push(SkillScreen) },
                            modifier = Modifier.fillMaxWidth().padding(16.dp)
                        ) {
                            Text("View all")
                        }
                    }
                }
            }
        }
    }
}

@OptIn(InternalResourceApi::class)
@Composable
fun HalfColorBoxWithImage(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(300.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.5f)
                .background(Color.LightGray)
                .align(Alignment.TopCenter)
        )

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.5f)
                .background(Color.White)
                .align(Alignment.BottomCenter)
        )

        Box(
            modifier = Modifier
                .size(250.dp)
                .clip(CircleShape)
                .border(4.dp, Color.White, CircleShape)
                .background(Color.Gray)
                .align(Alignment.Center)
        ) {
            Image(
                painter = ColorPainter(Color.Green),
                contentDescription = "Image",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        }
    }

    Card {
        Column(modifier = Modifier.background(Color.White)) {
            Text(
                "Ngou Long Kam",
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp)
            )

            Text(
                "Android Developer / Technical Test Engineer (Automation) at Capgemini",
                modifier = Modifier.fillMaxWidth().padding(16.dp)
            )
        }
    }
}

@Composable
private fun FourDpSpacer() {
    Spacer(modifier = Modifier.padding(4.dp))
}