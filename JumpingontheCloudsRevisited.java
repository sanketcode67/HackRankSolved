public class JumpingontheCloudsRevisited {

    static int jumpingOnClouds(int[] c, int k) {
        int n = c.length;
        int energy = 100;
        int cloud = 0;
        do
        {
            energy--; //You performed a jump

            cloud = (cloud + k) % n;

            if(c[cloud] == 1)
            {
                energy -= 2;//You landed on a thundercloud
            }
        }
        while(cloud != 0);

        return energy;

    }
}
