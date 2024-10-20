"use client";

import Loading from "./Loading";

interface ButtonProps {
    text: string;
    isLoading: boolean;
}

export default function Button({ text, isLoading }: ButtonProps) {
    return (
        <button
            type="submit"
            disabled={isLoading}
            className="bg-[#4C8C42] hover:bg-[#529148d6] active:bg-[#316d28]text-md rounded-lg w-full p-2.5 mt-10 mb-5 flex justify-center items-center">
            {isLoading ? (
                <Loading />
            ) : (
                <h3 className="font-bold tracking-wide text-white 2xl:text-lg">{text}</h3>
            )}
        </button>
    )
}
