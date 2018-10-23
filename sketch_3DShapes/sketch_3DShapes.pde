import peasy.*;

PeasyCam cam;

PVector[][] globe;
int total = 200;
int r = 300;
float offset = 0;
float m_s1 = 6;//5.7
float n1_s1 = 18.5;//0.5;
float n2_s1 = 8;//1;
float n3_s1 = -5;//2.5;
float m_s2 = 6;//10
float n1_s2 = 30;//3;
float n2_s2 = -7.25;//0.2;
float n3_s2 = -4;//1;
float a_s1 = 0.27;
float b_s1 = 5;
float a_s2 = 2;
float b_s2 = 2;
void setup()
{
  size(1000,1000, P3D);
  cam = new PeasyCam (this, 600);
  globe = new PVector[total+1][total+1];
  colorMode(HSB);
}


float superShape(float theta, float m, float n1, float n2, float n3, float a, float b) {

  float part1 = abs((1/a)*cos(m * theta / 4));
  part1 = pow(part1, n2);
  float part2 = abs((1/b)*sin(m * theta / 4));
  part2 = pow(part2, n3);
  float total = part1 + part2;
  total = pow(total, -1/n1);

  return total;
}


void draw(){
  //m_s1 = map(-cos(offset), -1, 1, 1, 10);
  offset += 0.05;

  background(0);
  lights(); 
  for (int i = 0; i < total+1; i++) {
    float lat = map(i, 0, total, 0, HALF_PI);
    float r2 = superShape(lat, m_s2, n1_s2, n2_s2, n3_s2, a_s2, b_s2);
    for (int j = 0; j < total+1; j++) {
      float lon = map(j, 0, total, -PI, PI);
      float r1 = superShape(lon, m_s1, n1_s1, n2_s1, n3_s1, a_s1 ,b_s1);
      float x = r * r1 * cos (lon) * r2 * cos (lat);
      float y = r * r1 * sin (lon) * r2 * cos (lat);
      float z = r * r2 * sin(lat);
      globe[i][j] = new PVector(x, y, z);
    }
  }
  noStroke();
  for (int i = 0; i < total; i++) {
    beginShape(TRIANGLE_STRIP);
    for (int j = 0; j < total+1; j++) {
      float hu = map(j, 0, total, 0, 255);
      fill(hu,255,255);
      PVector v = globe[i][j];
      vertex(v.x, v.y, v.z);
      PVector v2 = globe[i+1][j];
      vertex(v2.x, v2.y, v2.z);
    }
    endShape();
  }
}