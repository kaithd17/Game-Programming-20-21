using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Mario : MonoBehaviour
{
    float moveSpeed = 10.0f;
    int direction = 1;

    // Start is called before the first frame update
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        //get input values
        float xInput = Input.GetAxis("Horizontal");
        float yInput = Input.GetAxis("Vertical");
        //Compute new position of Mario
        float xDist = xInput * moveSpeed * Time.deltaTime;
        float yDist = yInput * moveSpeed * Time.deltaTime;
        
        //Debug.Log("Mario's position: " + transform.position);
        transform.position = transform.position + new Vector3(xDist, yDist, 0);
        if((xInput < 0 && direction==1) || (xInput>0 && direction==-1) )
        {
            transform.Rotate(0, 180, 0);
            direction *= -1;
        }
    }
}
