"use client";
import Image from "next/image";
import styles from "./page.module.css";
import { useEffect, useState } from "react";

export default function Home() {
  interface Teacher {
    id: number;
    name: string;
    age: number;
    course?: { name: string };
    unidades?: { name: string };
  }

  const [teachers, setTeachers] = useState<Teacher[]>([]);
  useEffect(() => {
    const apiUrl = "http://localhost:8080/teachers";

    // Fetch data using the fetch API
    fetch(apiUrl)
      .then((response) => {
        console.log(response);
        if (!response.ok) {
          throw new Error("Network response was not ok");
        }
        return response.json();
      })
      .then((data) => {
        setTeachers(data);
      })
      .catch((error) => {
        // Handle error
        console.error("Error fetching data:", error);
      });
  }, []);

  return (
    <div>
      <h1>Teacher List</h1>
      <div style={teacherListStyles}>
        {teachers.map((teacher) => (
          <div key={teacher.id} style={teacherCardStyles}>
            <h2>{teacher.name}</h2>
            <p>Age: {teacher.age}</p>
            <p>Course: {teacher.course ? teacher.course.name : "N/A"}</p>
            <p>Unit: {teacher.unidades ? teacher.unidades.name : "N/A"}</p>
          </div>
        ))}
      </div>
    </div>
  );
}

const teacherListStyles: React.CSSProperties = {
  display: 'flex',
  flexWrap: 'wrap',
};

const teacherCardStyles: React.CSSProperties = {
  border: '1px solid #ccc',
  borderRadius: '5px',
  padding: '10px',
  margin: '10px',
  width: '300px',
  boxShadow: '0 2px 4px rgba(0, 0, 0, 0.1)',
};

