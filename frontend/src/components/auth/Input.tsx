"use client";

import { useState } from "react";

interface InputProps {
    type: 'email' | 'password' | 'text';
    label: string;
    placeholder: string;
    value: string;
    onChange: (e: React.ChangeEvent<HTMLInputElement>) => void;
}

export default function Input({ type, label, placeholder, value, onChange }: InputProps) {
    const [isPasswordVisible, setIsPasswordVisible] = useState(false);

    const togglePasswordVisibility = () => {
        setIsPasswordVisible(!isPasswordVisible);
    }

    return (
        <div className="relative mb-5">
            <label className="block text-sm 2xl:text-base font-medium mb-1">{label}</label>
            <input
                type={type === "password" && !isPasswordVisible ? "password" : type}
                className="bg-gray-100 border text-md rounded-lg block w-full p-2.5"
                placeholder={placeholder}
                value={value}
                onChange={onChange}
                required />

            {type === "password" && (
                <div
                    className="absolute right-2.5 top-11 transform -translate-y-1/2 cursor-pointer bg-gray-100"
                    onClick={togglePasswordVisibility}>
                    <img
                        className="w-4"
                        src={isPasswordVisible
                            ? "https://img.icons8.com/?size=100&id=4y6r43dyjbzw&format=png&color=000000"
                            : "https://img.icons8.com/?size=100&id=nx1IDGruJph4&format=png&color=000000"}
                        alt="Visibilidade da senha" />
                </div>
            )}
        </div>
    )
}
